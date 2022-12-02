import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import clientAxios from "../Configuration/ClientAxios";
import "../styles/style.css";

const Oportunities = () => {
  const [user, setUser] = useState("");

  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");

  const reload = () => {
    window.location.reload(true);
  };

  useEffect(() => {
    const obtenerUsuarios = async () => {
      try {
        //por defecto get
        const { data } = await clientAxios("/oportunities");
        console.log(data);
        setUser(data);
      } catch (error) {
        console.log(error);
      }
    };
    obtenerUsuarios();
  }, []);

  if (!user) {
    return <h1>Loading...</h1>;
  }

  const swapType = async (userType, userId) => {
    if (userType === 1) {
      await clientAxios.put("/users/" + userId + "/isClient");

      reload();
    } else {
      await clientAxios.put("/users/" + userId + "/isNoClient");
      reload();
    }
  };

  return (
    <div className="panel-contactos">
      <div className="contactos">
        LISTA DE OPORTUNIDADES
        {user.map((user) => (
          <div className="contacto" key={user.id}>
            Id: {user.id} <br />
            Nombre: {user.name} <br />
            Numero Telefono: {user.phoneNumber} <br />
            Email: {user.email}
            <br />
            Contacto Id: {user.contactId}
            <br />
            Es Cliente: {user.client == 1 ? "Es cliente" : "No es cliente"}
            <br />
            <br />
            <button
              id="botonCambiarCliente"
              onClick={(e) => {
                e.preventDefault();
                swapType(user.client, user.id);
              }}
            >
              Cambiar Tipo Cliente
            </button>
          </div>
        ))}
      </div>

      <div className="containerButton">
        <a className="enlaceAddContact" href="/addContact">
          Add Oportunitie
        </a>
        <a
          id="atrasOportunities"
          className="enlaceAddContact"
          href="/principalPage"
        >
          Back
        </a>
      </div>
    </div>
  );
};

export default Oportunities;

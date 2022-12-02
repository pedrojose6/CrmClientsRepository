import { useState, useEffect } from "react";
import clientAxios from "../Configuration/ClientAxios";
import "../styles/style.css";

const Clients = () => {
  const [user, setUser] = useState("");

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

  return (
    <div className="panel-contactos">
      <div className="contactos">
        LISTA DE CLIENTES
        {user.map((user) => (
          <div className="contacto" key={user.id}>
            {user.client == 1 ? (
              <>
                Id: {user.id} <br />
                Nombre: {user.name} <br />
                Numero Telefono: {user.phoneNumber} <br />
                Email: {user.email}
                <br />
                Contacto Id: {user.contactId}
                <br />
                <br />
              </>
            ) : (
              "..."
            )}
          </div>
        ))}
      </div>

      <div className="containerButton">
        <a className="enlaceAddContact" href="/addContact">
          Add Contact
        </a>
        <a id="atrasClients" className="enlaceAddContact" href="/principalPage">
          Back
        </a>
      </div>
    </div>
  );
};

export default Clients;

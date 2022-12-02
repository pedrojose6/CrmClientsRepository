import { useState, useEffect } from "react";
import clientAxios from "../Configuration/ClientAxios";
import "../styles/style.css";

const Contacts = () => {
  const [user, setUser] = useState("");

  useEffect(() => {
    const obtenerUsuarios = async () => {
      try {
        //por defecto get
        const { data } = await clientAxios("/contacts");
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
  const addContact = (e) => {
    e.preventDefault();
    nav("/addContact");
  };
  return (
    <div className="panel-contactos">
      <div className="contactos">
        LISTA DE CONTACTOS
        {user.map((user) => (
          <div className="contacto" key={user.id}>
            Id: {user.id} <br />
            Tipo de Contacto: {user.type} <br />
            Fecha de Contacto: {user.dateContact} <br />
            Descripcion: {user.description}
            <br /> <br />
          </div>
        ))}
      </div>

      <div className="containerButton">
        <a id="crearContacto" className="enlaceAddContact" href="/addContact">
          Add Contact
        </a>
        <a className="enlaceAddContact" href="/principalPage">
          Back
        </a>
      </div>
    </div>
  );
};

export default Contacts;

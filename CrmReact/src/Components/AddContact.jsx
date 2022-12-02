import { useNavigate } from "react-router-dom";
import { useState } from "react";
import "../styles/style.css";

export const AddContact = () => {
  const [id, setId] = useState("");
  const [type, setType] = useState("");
  const [dateContact, setDate] = useState("");
  const [description, setDescription] = useState("");

  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");

  const nav = useNavigate();

  const addContact = async (e) => {
    e.preventDefault();

    if (id != "" && type != "" && dateContact != "" && description != "") {
      alert("Contacto añadido correctamente");

      fetch(`http://localhost:8080/save`, {
        method: "POST",

        headers: myHeaders,

        body: JSON.stringify({
         
          id: id,

          type: type,

          dateContact: dateContact,

          description: description,
        }),
      }).then(() => {
        nav("/addOportunitie");
      });
    } else {
      setTimeout(() => {
        alert("Introduce los datos enteros loco");
      }, 0);
    }
  };

  return (
    <div className="formulario">
      <h2 className="titleLogin">Add Contact</h2>
      <form
        className="my-10 px-10 py-5 border-4 formularioHijo"
        onSubmit={addContact}
      >
        <div className="my-5 cajaTexto">
          <label className="text-gray-700 uppercase font-bold" htmlFor="id">
            Id
          </label>
          <input
            id="id"
            type="number"
            placeholder="Contact Id"
            className="w-full mt-3 border rounded-lg"
            value={id}
            onChange={(e) => setId(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label className="text-gray-700 uppercase font-bold" htmlFor="type">
            Type
          </label>
          <input
            id="type"
            type="text"
            placeholder="Type of Contact"
            className="w-full mt-3 border rounded-lg"
            value={type}
            onChange={(e) => setType(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label
            className="text-gray-700 uppercase font-bold"
            htmlFor="dateContact"
          >
            Date
          </label>
          <input
            id="dateContact"
            type="text"
            placeholder="Date of Contact"
            className="w-full mt-3 border rounded-lg"
            value={dateContact}
            onChange={(e) => setDate(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label
            className="text-gray-700 uppercase font-bold"
            htmlFor="description"
          >
            Description
          </label>
          <input
            id="description"
            type="textarea"
            placeholder="Description of Contact"
            className="w-full mt-3 border rounded-lg"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
          />
        </div>
        <input
          id="addContact"
          type="submit"
          value="Acceder"
          className="enlaceAddContact bg-blue-700 w-full py-2 text-white font-bold rounded-md hover:cursor-pointer hover:bg-blue-900 transition-colors"
        />
        <a className="enlaceAddContact" href="/principalPage">
          Back
        </a>
      </form>
    </div>
  );
};

export default AddContact;

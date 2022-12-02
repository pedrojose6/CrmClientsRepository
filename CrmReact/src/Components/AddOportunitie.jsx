import { useNavigate } from "react-router-dom";
import { useState } from "react";
import "../styles/style.css";

export const AddOportunitie = () => {
  const [id, setId] = useState("");
  const [name, setName] = useState("");
  const [phoneNumber, setPhoneNumber] = useState("");
  const [email, setEmail] = useState("");
  const [contactId, setContactId] = useState("");
  const [client, setClient] = useState("");
 
  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");

  const nav = useNavigate();

  const addOportunitie = async (e) => {
    e.preventDefault();

    if (
      id != "" &&
      name != "" &&
      phoneNumber != "" &&
      email != "" &&
      client != ""
    ) {
      alert("Oportunidad creada correctamente");

      fetch(`http://localhost:8080/saveOportunitie`, {
        method: "POST",

        headers: myHeaders,

        body: JSON.stringify({
          id: id,

          name: name,

          phoneNumber: phoneNumber,

          email: email,

          contactId: contactId,

          client: client,
        }),
      }).then(() => {
        nav("/principalPage");
      });
    } else {
      setTimeout(() => {
        alert("Introduce los datos enteros loco");
      }, 0);
    }
  };

  return (
    <div className="formulario">
      <h2 className="titleLogin">Add Oportunitie</h2>
      <form
        className="my-10 px-10 py-5 border-4 formularioHijo"
        onSubmit={addOportunitie}
      >
        <div className="my-5 cajaTexto">
          <label className="text-gray-700 uppercase font-bold" htmlFor="id">
            Id
          </label>
          <input
            id="idOpor"
            type="number"
            placeholder="Contact Id"
            className="w-full mt-3 border rounded-lg"
            value={id}
            onChange={(e) => setId(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label className="text-gray-700 uppercase font-bold" htmlFor="name">
            Name
          </label>
          <input
            id="nameOpor"
            type="text"
            placeholder="Name of Oportunite"
            className="w-full mt-3 border rounded-lg"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label
            className="text-gray-700 uppercase font-bold"
            htmlFor="phoneNumber"
          >
            Phone Number
          </label>
          <input
            id="phoneNumberOpor"
            type="text"
            placeholder="Phone Number"
            className="w-full mt-3 border rounded-lg"
            value={phoneNumber}
            onChange={(e) => setPhoneNumber(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label className="text-gray-700 uppercase font-bold" htmlFor="email">
            Email
          </label>
          <input
            id="emailOpor"
            type="email"
            placeholder="Email of Oportunitie"
            className="w-full mt-3 border rounded-lg"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label
            className="text-gray-700 uppercase font-bold"
            htmlFor="contactId"
          >
            Id Contacto
          </label>
          <input
            id="contactIdOpor"
            type="number"
            placeholder="Contact ID"
            className="w-full mt-3 border rounded-lg"
            value={contactId}
            onChange={(e) => setContactId(e.target.value)}
          />
        </div>
        <div className="my-5 cajaTexto">
          <label className="text-gray-700 uppercase font-bold" htmlFor="client">
            Is Client?
          </label>
          <input
            id="clientOpor"
            type="number"
            placeholder="Is Client"
            className="w-full mt-3 border rounded-lg"
            value={client}
            onChange={(e) => setClient(e.target.value)}
          />
        </div>
        <input
          id="addOportunitie"
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

export default AddOportunitie;

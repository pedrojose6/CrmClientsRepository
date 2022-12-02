import { useNavigate } from "react-router-dom";
import { useState } from "react";
import "../styles/style.css";

export const PrincipalPage = () => {
  const nav = useNavigate();

  return (
    <div className="formulario">
      <a id="viewAllContacts" className="enlaceAddContact" href="/contacts">
        View All Contacts
      </a>
      <a id="viewAllClients" className="enlaceAddContact" href="/clients">
        View All Clients
      </a>
      <a
        id="viewAllOportunities"
        className="enlaceAddContact"
        href="/oportunities"
      >
        View All Oportunities
      </a>
    </div>
  );
};

export default PrincipalPage;

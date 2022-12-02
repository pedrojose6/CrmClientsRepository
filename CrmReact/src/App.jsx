import "./App.css";
import Contacts from "./Components/Contacts";
import Login from "./Components/Login";
import Oportunities from "./Components/Oportunities";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import AddContact from "./Components/AddContact";
import { createContext } from "react";
import PrincipalPage from "./Components/PrincipalPage";
import AddOportunitie from "./Components/AddOportunitie";
import Clients from "./Components/Clients";

function App() {
  const context = createContext();

  return (
    <BrowserRouter>
      <Routes>
        <Route path="contacts" element={<Contacts />} />
        <Route path="principalPage" element={<PrincipalPage />} />
        <Route path="oportunities" element={<Oportunities />} />
        <Route path="addOportunitie" element={<AddOportunitie />} />
        <Route path="clients" element={<Clients />} />
        <Route path="login" element={<Login />} />
        <Route path="addContact" element={<AddContact />} />
        <Route path="save" element={<AddContact />} />
        <Route path="users/:id/isNoClient" element={<Oportunities />} />
        <Route path="users/:id/isClient" element={<Oportunities />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;

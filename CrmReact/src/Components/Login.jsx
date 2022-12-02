import { useNavigate } from "react-router-dom";
import { useState } from "react";
import "../styles/style.css";

export const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const nav = useNavigate();

  const loginSubmit = (e) => {
    e.preventDefault();

    if (email === "solera@solera.com" && password === "bootcamp4") {
      nav("/principalPage");
    } else {
      setTimeout(() => {
        alert("Incorrecto amigo");
      }, 0);
    }
  };

  return (
    <div className="formulario">
      <h2 className="titleLogin">Oportunities and clients CRM</h2>
      <h3 className="titleLoginH3">Login</h3>
      <form className="my-10 px-10 py-5 border-4" onSubmit={loginSubmit}>
        <div className="cajaTexto my-5">
          <label className="text-gray-700 uppercase font-bold" htmlFor="email">
            Email
          </label>
          <input
            id="email"
            type="email"
            placeholder="Email"
            className="w-full mt-3 border rounded-lg"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className="cajaTexto my-5">
          <label
            className="text-gray-700 uppercase font-bold"
            htmlFor="password"
          >
            Password
          </label>
          <input
            id="password"
            type="password"
            placeholder="Password"
            className="w-full mt-3 border rounded-lg"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <input
          id="botonLogin"
          type="submit"
          value="Acceder"
          className="login__submit bg-blue-700 w-full py-2 text-white font-bold rounded-md hover:cursor-pointer hover:bg-blue-900 transition-colors"
        />
      </form>
    </div>
  );
};

export default Login;

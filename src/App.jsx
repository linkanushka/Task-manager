import { useState } from "react";
import Register from "./pages/Register";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";
import "./App.css";

function App() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (
    <div className="container">

      <h1>Task Management System</h1>

      {!loggedIn ? (
        <>
          <div className="card">
            <Register />
          </div>

          <div className="card">
            <Login setLoggedIn={setLoggedIn} />
          </div>
        </>
      ) : (
        <Dashboard />
      )}

    </div>
  );
}

export default App;
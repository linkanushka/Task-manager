import { useEffect, useState } from "react";
import axios from "axios";

function Dashboard() {

  const [tasks, setTasks] = useState([]);

  useEffect(() => {

    axios
      .get("http://localhost:8089/api/tasks")
      .then((response) => {
        setTasks(response.data);
      });

  }, []);

  return (
    <div>

      <h2>Dashboard</h2>
      <input
      placeholder="Task Title"
      />

      <input
      placeholder="Task Description"
      />

      <button>
      Add Task
      </button>

      {tasks.map((task) => (

        <div
          key={task.id}
          style={{
            border: "1px solid black",
            margin: "10px",
            padding: "10px"
          }}
        >

          <h3>{task.title}</h3>

          <p>{task.description}</p>

          <p>Status: {task.status}</p>

        </div>

      ))}

    </div>
  );
}

export default Dashboard;



import React, { Component } from "react";
import ToDoContainer from "./components/ToDo/ToDoContainer";
import StoreProvider from "./stateManagement/store/StoreProvider";
import 'bootstrap/dist/css/bootstrap.css';
import Navbar from "./components/Navbar";

export const HOST_API = "http://localhost:8080/api";

class App extends Component {
  render() {
    return (
      <StoreProvider>
        <div>
          <Navbar />
          <ToDoContainer />
        </div>
      </StoreProvider>
    );
  }
}

export default App;

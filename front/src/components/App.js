import React, { Component } from "react";
import ToDoContainer from "./ToDo/ToDoContainer";
import StoreProvider from "../stateManagement/store/StoreProvider";

export const HOST_API = "http://localhost:8080/api";

class App extends Component {
  render() {
    return (
      <StoreProvider>
        <div>
          <ToDoContainer />
        </div>
      </StoreProvider>
    );
  }
}

export default App;

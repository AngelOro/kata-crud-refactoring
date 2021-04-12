import React, { Component } from "react";
import ToDoForm from "./ToDoForm";
import ToDoView from "./ToDoView";

class ToDoContainer extends Component {
  render() {
    return (
        <div className="col-sm-12">
          <ToDoForm />
          <ToDoView />
        </div>
    );
  }
}

export default ToDoContainer;

import React, { Component } from "react";
import icon from "../assets/to-do-list.png";

export class Navbar extends Component {
  render() {
    return (
      <nav className="navbar navbar-dark bg-dark">
        <div className="container-fluid">
          <div className="navbar-brand input-group">
            <img src={icon} alt="icon-todoList" className="icon-todoList" />
            <h1>To-Do List</h1>
          </div>
        </div>
      </nav>
    );
  }
}

export default Navbar;

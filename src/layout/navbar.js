import React from "react";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <div>
      <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
          <a class="navbar-brand" href="/">
            Full Stack Application Frontend
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <Link className="btn btn-outline-light " to="/adduser">Add User</Link>
        </div>
      </nav>
    </div>
  );
}

export default Navbar;

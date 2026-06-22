import "./Register.css";

function Register() {
  return (
    <div className="page">
      <div className="overlay"></div>

      <div className="register-container">
        <div className="logo">🏨</div>

        <h1>Hotel Reservation System</h1>
        <p>Create Your Account</p>

        <form>
          <input type="text" placeholder="Enter Full Name" />
          <input type="email" placeholder="Enter Email" />
          <input type="text" placeholder="Enter Username" />
          <input type="password" placeholder="Enter Password" />
          <input type="password" placeholder="Confirm Password" />

          <button type="submit">Register</button>
        </form>

        <div className="footer">
          Already have an account? <a href="#">Login Here</a>
        </div>
      </div>
    </div>
  );
}

export default Register;
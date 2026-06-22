import "./Login.css";

function Login() {
  return (
    <div className="page">
      <div className="overlay"></div>

      <div className="login-container">
      <h1>Hotel Reservation </h1><h3>system</h3>
<p>Sign in to continue</p>

        <form>
          <input
            type="text"
            placeholder="Enter Username"
          />

          <input
            type="password"
            placeholder="Enter Password"
          />

          <button type="submit">Login</button>
        </form>

        <div className="footer">
          New User? <a href="#">Register Here</a>
        </div>
      </div>
    </div>
  );
}

export default Login;
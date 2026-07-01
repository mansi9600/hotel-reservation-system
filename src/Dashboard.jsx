import "./Dashboard.css";
import {
  FaHotel,
  FaHome,
  FaBed,
  FaClipboardList,
  FaUsers,
  FaCog,
  FaBell,
  FaUserCircle,
  FaBars,
  FaArrowRight
} from "react-icons/fa";

function Dashboard() {

  return (

      <div className="dashboard">

        {/* Sidebar */}

        <aside className="sidebar">

          <div className="logo">
            <FaHotel />
            <h2>Grand Hotel</h2>
          </div>

          <ul>

            <li className="active">
              <FaHome />
              Dashboard
            </li>

            <li>
              <FaBed />
              Rooms
            </li>

            <li>
              <FaClipboardList />
              Reservations
            </li>

            <li>
              <FaUsers />
              Customers
            </li>

            <li>
              <FaCog />
              Settings
            </li>

          </ul>

        </aside>

        {/* Main */}

        <main className="main">

          {/* Topbar */}

          <header className="topbar">

            <FaBars className="menu"/>

            <div className="top-right">

              <FaBell className="icon"/>

              <div className="profile">

                <FaUserCircle className="profile-icon"/>

                <div>

                  <h4>Admin</h4>

                  <span>Administrator</span>

                </div>

              </div>

            </div>

          </header>

          {/* Welcome */}

          <section className="welcome">

            <h1>Welcome Back, Admin 👋</h1>

            <p>Manage your hotel efficiently from one place.</p>

          </section>

          {/* Hero Cards */}

          <section className="hero-cards">

            <div className="hero-card rooms">

              <div>

                <h2>VIEW ROOMS</h2>

                <p>Browse all available hotel rooms.</p>

                <button>

                  View Rooms

                  <FaArrowRight/>

                </button>

              </div>

              <div className="emoji">

                🛏️

              </div>

            </div>

            <div className="hero-card booking">

              <div>

                <h2>BOOK ROOM</h2>

                <p>Create a new reservation instantly.</p>

                <button>

                  Book Room

                  <FaArrowRight/>

                </button>

              </div>

              <div className="emoji">

                🏨

              </div>

            </div>

          </section>

          {/* Statistics */}

          <section className="stats">

            <div className="stat-card">

              <div className="stat-icon room-icon">🏨</div>

              <div>
                <h3>Total Rooms</h3>
                <h2>100</h2>
              </div>

            </div>

            <div className="stat-card">

              <div className="stat-icon available-icon">✅</div>

              <div>
                <h3>Available Rooms</h3>
                <h2>35</h2>
              </div>

            </div>

            <div className="stat-card">

              <div className="stat-icon booked-icon">📅</div>

              <div>
                <h3>Booked Rooms</h3>
                <h2>65</h2>
              </div>

            </div>

            <div className="stat-card">

              <div className="stat-icon customer-icon">👥</div>

              <div>
                <h3>Customers</h3>
                <h2>250</h2>
              </div>

            </div>

          </section>


          {/* Booking Form + Recent Bookings */}

          <section className="content-grid">

            {/* Booking Form */}

            <div className="booking-card">

              <h2>New Booking</h2>

              <input
                  type="text"
                  placeholder="Customer Name"
              />

              <select>

                <option>Select Room</option>

                <option>101</option>

                <option>102</option>

                <option>201</option>

                <option>301</option>

              </select>

              <input type="date" />

              <input type="date" />

              <button>Create Booking</button>

            </div>

            {/* Recent Bookings */}

            <div className="table-card">

              <h2>Recent Bookings</h2>

              <table>

                <thead>

                <tr>

                  <th>Customer</th>

                  <th>Room</th>

                  <th>Status</th>

                </tr>

                </thead>

                <tbody>

                <tr>

                  <td>Akash</td>

                  <td>201</td>

                  <td className="confirmed">
                    Confirmed
                  </td>

                </tr>

                <tr>

                  <td>batman</td>

                  <td>105</td>

                  <td className="pending">
                    Pending
                  </td>

                </tr>

                <tr>

                  <td>spiderman</td>

                  <td>301</td>

                  <td className="checkedin">
                    Checked In
                  </td>

                </tr>

                </tbody>

              </table>

            </div>

          </section>

        </main>

      </div>

  );

}

export default Dashboard;









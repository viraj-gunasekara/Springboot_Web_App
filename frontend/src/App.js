import "./App.css";
import Authentication from "./pages/Authentication/Authentication";
import { BrowserRouter, Routes, Route, useNavigate } from "react-router-dom";
import HomePage from "./pages/HomePage/HomePage";
import { useEffect } from "react";
import { getProfileAction } from "./Redux/Auth/auth.action";
import { useDispatch, useSelector } from "react-redux";
import { store } from "./Redux/store";

function App() {
  const {auth} = useSelector(store=>store);
  const dispatch = useDispatch();
  const jwt = localStorage.getItem("jwt");

  useEffect(()=>{
    dispatch(getProfileAction(jwt))
  },[auth.jwt])

  return (
    <div className="">
      <BrowserRouter>
        <Routes>
          
          <Route path="/*" element={auth.user?<HomePage />:<Authentication/>} />
          
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

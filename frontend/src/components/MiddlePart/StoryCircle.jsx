import React from "react";
import { Avatar } from "@mui/material";

const StoryCircle = () => {
  return (
    <div>
      <div className="flex flex-col items-center mr-5 cursor-pointer">
        <Avatar
          sx={{ width: "4rem", height: "4rem" }}
          src="https://cdn.pixabay.com/photo/2022/06/15/12/20/couple-7263799_1280.jpg"
        ></Avatar>
        <p>virajSg</p>
      </div>
    </div>
  );
};

export default StoryCircle;

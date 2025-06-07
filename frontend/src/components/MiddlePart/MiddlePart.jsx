import React from "react";
import { Avatar } from "@mui/material";
import AddIcon from "@mui/icons-material/Add";
import StoryCircle from "./StoryCircle";

const story = [1, 1, 1, 1, 1];

const MiddlePart = () => {
  return (
    <div className="px-20">
      <section className="flex items-center p-5 rounded-b-md">
        <div className="flex flex-col items-center mr-5 cursor-pointer">
          <Avatar sx={{ width: "4rem", height: "4rem" }}>
            <AddIcon sx={{ fontSize: "3rem" }} />
          </Avatar>
          <p>Status</p>
        </div>
        {story.map((item) => (
          <StoryCircle />
        ))}
      </section>
    </div>
  );
};

export default MiddlePart;

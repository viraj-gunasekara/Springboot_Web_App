import React from "react";
import { red } from "@mui/material/colors";
import {
  Card,
  Avatar,
  CardHeader,
  IconButton,
  CardMedia,
  CardContent,
  Typography,
  CardActions,
} from "@mui/material";
import MoreVertIcon from "@mui/icons-material/MoreVert";
import FavoriteIcon from "@mui/icons-material/Favorite";
import FavoriteBorderIcon from "@mui/icons-material/FavoriteBorder";
import ShareIcon from "@mui/icons-material/Share";
import ChatBubbleIcon from "@mui/icons-material/ChatBubble";
import BookmarkIcon from "@mui/icons-material/Bookmark";
import BookmarkBorderIcon from "@mui/icons-material/BookmarkBorder";

const PostCard = () => {
  return (
    <Card>
      <CardHeader
        avatar={
          <Avatar sx={{ bgcolor: red[500] }} aria-label="recipe">
            V
          </Avatar>
        }
        action={
          <IconButton aria-label="settings">
            <MoreVertIcon />
          </IconButton>
        }
        title="V.S. Gunasekara"
        subheader="@it21320378"
      />

      <CardMedia
        component="img"
        height="194"
        image="https://cdn.pixabay.com/photo/2017/11/13/15/09/biceps-2945912_1280.jpg"
        alt="Paella dish"
      />

      <CardContent>
        <Typography variant="body2" color="text.secondary">
          Biceps, Triceps, Fit image. Free for use.
        </Typography>
      </CardContent>

      <CardActions className="flex justify-between" disableSpacing>
        <div>
          <IconButton color="error">
            {true ? <FavoriteIcon /> : <FavoriteBorderIcon />}
          </IconButton>
          <IconButton>{<ChatBubbleIcon />}</IconButton>
          <IconButton color="primary">{<ShareIcon />}</IconButton>
        </div>

        <div>
          <IconButton>
            {true ? <BookmarkIcon /> : <BookmarkBorderIcon />}
          </IconButton>
        </div>
      </CardActions>
    </Card>
  );
};

export default PostCard;

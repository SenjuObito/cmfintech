package com.example.obito.model;

import java.util.Date;
import java.util.List;

public class News {
        private String id;
        private String titile;
        private String source;
        private Date dateTme;
        private Image image;
        private boolean top;
        private List<Comments> comments;

        public void setId(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }

        public void setTitile(String titile) {
            this.titile = titile;
        }
        public String getTitile() {
            return titile;
        }

        public void setSource(String source) {
            this.source = source;
        }
        public String getSource() {
            return source;
        }

        public void setDateTme(Date dateTme) {
            this.dateTme = dateTme;
        }
        public Date getDateTme() {
            return dateTme;
        }

        public void setImage(Image image) {
            this.image = image;
        }
        public Image getImage() {
            return image;
        }

        public void setTop(boolean top) {
            this.top = top;
        }
        public boolean getTop() {
            return top;
        }

        public void setComments(List<Comments> comments) {
            this.comments = comments;
        }
        public List<Comments> getComments() {
            return comments;
        }




}

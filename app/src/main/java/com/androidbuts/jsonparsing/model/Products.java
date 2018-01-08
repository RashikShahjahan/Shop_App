package com.androidbuts.jsonparsing.model;

import android.media.Image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Products {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private Image image;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * @return The images
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image The images
     */
    public void setImage(Image image) {
        this.image = image;
    }

    public class image {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("product_id")
        @Expose
        private String product_id;
        @SerializedName("position")
        @Expose
        private String position;
        @SerializedName("position")
        @Expose
        private String created_at;
        @SerializedName("created_at")
        @Expose
        private String updated_at;
        @SerializedName("updated_at")
        @Expose
        private String width;
        @SerializedName("width")
        @Expose
        private String height;
        @SerializedName("height")
        @Expose
        private String src;
        @SerializedName("src")


        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void set(String id) {
            this.id = id;
        }

        /**
         * @return The product_id
         */
        public String getProduct_id() {
            return product_id;
        }

        /**
         * @param product_id The product_id
         */
        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }

        /**
         * @return The position
         */
        public String getPosition() {
            return position;
        }

        /**
         * @param position The position
         */
        public void setPosition(String position) {
            this.position = position;
        }

        public String getCreated_at() {
            return created_at;
        }

        /**
         * @param created_at  created_at
         */
        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        /**
         * @param updated_at  updated_at
         */
        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getWidth() {
            return width;
        }


        /**
         * @param width The width
         */
        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }


        /**
         * @param height The height
         */
        public void setHeight(String height) {
            this.height = height;
        }

        public String getSrc() {
            return src;
        }

        /**
         * @param src The src
         */
        public void setSrc(String src) {
            this.src = src;
        }


    }
}
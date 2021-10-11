const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const blogPostSchema = new Schema({
    title: String,
    body: String
});

const blogPost = mongoose.model('blogPost', blogPostSchema);

module.exports = blogPost;
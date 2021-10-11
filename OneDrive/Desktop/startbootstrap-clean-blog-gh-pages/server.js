const path = require('path');
const express = require('express');

const port = process.env.port || 8888;
const app = express();
const mongoose = require('mongoose');
const ejs = require('ejs');

// Add middleware
app.use(express.static('public'));

// Set view engine - we are using embedded js - could use handlebard, pug, etc.
app.set('view engine', 'ejs');

// Connect to Mongoose  default port is 27017
mongoose.connect('mongodb://localhost:27017/blogdb');

const blogPost = require('./models/blogPost');

// Start creating routes
app.get('/', (req, res) => {
    res.render('index');
});

app.get('/about', (req, res) => {
    res.render('about');
});

app.get('/post', (req, res) => {
    res.render('post');
});

app.get('/contact', (req, res) => {
    res.render('contact');
});


app.listen(port, () => {
    console.log(`App up and running on port ${port}`);
})
const express= require('express');

const app= express();

const port= 3000;

const bodyParser= require("body-parser");

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true}));


app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
    
});

const COMMON= require('./COMMON');
const uri= COMMON.uri;

const mongoose= require('mongoose');

const carModel= require('./carModel');

const apiMobile= require('./api');
app.use('/api', apiMobile);

app.get('/', async (req, res) => {
    await mongoose.connect(uri);

    let cars= await carModel.find();

    console.log(cars);

    res.send(cars);

});

app.post('/add_xe', async (req, res) =>{
    await mongoose.connect(uri);


    let car= req.body;
    
    let kq= await carModel.create(car);

    let cars= await carModel.find();

    console.log(cars);

    res.send(cars);
    
})

app.get('/xoa/:id', async (req, res) => {
    await mongoose.connect(uri);

    let id= req.params.id;
    console.log(id);

    await carModel.deleteOne({_id: id});

    res.redirect('../')
    
});


const express = require("express");
const { faker } = require("@faker-js/faker");
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));


const CreateUser = () => {
  const newUser = {
      id: faker.datatype.number(),
      Password: faker.internet.password(),
      Email: faker.internet.email(),
      PhoneNumber: faker.phone.phoneNumber(),
      LastName: faker.name.lastName(),
      FirstName: faker.name.firstName()
  };
  return newUser;
};

const CreateCompany = () => {
  const newCompany = {
      id: faker.datatype.number(),
      Name: faker.company.companyName(),
      Address:{
          street: faker.address.streetName(),
          city: faker.address.cityName(),
          state: faker.address.state(),
          zipCode: faker.address.zipCode(),
          country: faker.address.country(),
      }
  };
  return newCompany;
};

app.get("/api/users/new", (req, res) => {
  const newUser = CreateUser();
  res.json(newUser);
});

app.get("/api/companies/new", (req, res) => {
  const newCompany = CreateCompany();
  res.json(newCompany);
});

app.get("/api/user/company", (req, res) => {
  const newUser = CreateUser();
  const newCompany = CreateCompany();
  res.json([newUser, newCompany]);
});

const server = app.listen(8000, () =>
  console.log(`Server is locked and loaded on port ${server.address().port}!`)
);

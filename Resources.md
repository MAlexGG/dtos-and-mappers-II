# Exercise

1. Use DTOs and mappers to return a response that takes the information of the school with a list of students with all its fields:

{
  "id": 2,
  "name": "Engineering",
  "students": [
    {
      "id": 2,
      "name": "Gaby",
      "lastname": "Galarza",
      "dni_nie": "80311931E",
      "phone": 625269925,
      "email": "gabi@mail.com"
    },
    {
      "id": 3,
      "name": "John",
      "lastname": "Doe",
      "dni_nie": "20322939A",
      "phone": 635220931,
      "email": "john@mail.com"
    }
  ]
}

2. Use DTOs and mappers to return a response where shows the name of the school by student without returnin a nested info:

{
  "id": 3,
  "name": "John",
  "lastname": "Doe",
  "dniNie": 44564357A,
  "schoolId": 2,
  "schoolName": "Engineering"
}
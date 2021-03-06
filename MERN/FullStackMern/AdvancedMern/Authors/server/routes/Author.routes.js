const AuthorController = require("../controllers/Author.controller");
module.exports = function(app) {
    app.get("/api/authors", AuthorController.getAllAuthors);
    app.get("/api/authors/:id", AuthorController.getAuthor);
    app.put("/api/authors/:id", AuthorController.updateAuthor);
    app.delete("/api/authors/:id", AuthorController.deleteAuthor);
    app.post("/api/authors", AuthorController.createAuthor);
};
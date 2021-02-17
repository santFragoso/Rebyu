# Rebyu
🍿 A simple API for reviews

## How to Contribute?

### Issues

Every task that needs to be done first needs to have an issue, once the issue is created you can now create the branch.

### Branches

The project will be divided in branches. Each branch will be a feature, fix, or refactor that will be added by the contributor. For example, if we have to add the CRUD for a resource, then there's going to be a branch that will be called `kind/nameOfTheChange`.

| Kind        | Description                         |
| ----------- | ----------------------------------- |
| feature     | A new feature that will be added    |
| fix         | If you need to fix something        |
| refactor    | Refact the code                     |
| update      | Anything that only adds content     |

For example if you'll add the `crudapi` then your branch will be named `feature/crudapi`. Also every single feature will be asigned to the developere. And for each feature there's going to be an issue open.

When you finish the devlopment of all your changes you'll need to open a pull request to the main branch and link it with the issue you're solving. Finally all the CI process will begin and when it's done the DevOps integrante will accept that Pull Request.

### Commits

The commits you make will follow all the same format as the branches. Using the `git commit`command.

```
feat: Short title

Detailed complete changes
```

> You can achieve this kind of commits by only using `git commit` without the `-m` flag.

And using the same kind table as above.

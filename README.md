# Rebyu
🍿 A simple API for reviews

## How-to Contribute
Anyone who wants to help this repository must follow the guideline, this is to ensure an easily team development process.

The main workflow that we use in **Lintori** follows these steps:
1. Detect the feature to add, feature to upgrade (refactor) or  problem to fix.
2. Create an [issue](#issues) that explains the feature/refactor/fix.
3. Once the issue is created fork the repo (if you don't have access to it) and create a branch to work with ([see the branch naming convention](#branches)).
4. While working in the code, you must follow the [commits naming convention](#commits) and the [code naming convention](#code).
5. Once the issue is fulfilled proceed to make a pull-request (PR) linking the issue to it and wait til we approve the PR.

### Issues

Every task that needs to be done first needs to have an issue, once the issue is created you can now create the branch.

The issue must have a concrete name, and a body that details what needs to be done.

### Branches

The project will be divided in branches. Each branch will be a feature, fix, or refactor that will be added by the contributor. The branching naming convention is `kind/issue-number/name-of-the-branch`.

| Kind        | Description                         |
| ----------- | ----------------------------------- |
| feature     | A new feature that will be added    |
| fix         | If you need to fix something        |
| refactor    | Refact the code                     |
| update      | Anything that only adds content     |

When you finish the development of all your changens, then you will open a pull request to the main branch and link the PR with the issue you're solving. Finally all the CI process will begin and when it's done the DevOps integrante will accept that PR.

### Commits

The commits you make will follow all the same format as the branches. Using the `git commit` command.

```
kind: Brief title

Complete detailed changes
```

> You can achieve this kind of commits by only using `git commit` without the `-m` flag.

### Code

Before starting coding, take in mind this:

- Functions and variables names use `cammelCase`.
- Constants are all in uppercase.
- Classes always starts with a capital letter.

We break our code into tiny pure functions (that only solve one problem) whenever possible, using verbs to describe what does the function does.

The code itself must be easy-to-read, use the best describing names for variables and functions and use comments to give a more detailed explanation.

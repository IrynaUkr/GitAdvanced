# GitAdvanced

working directory -> git add -> index(staging area) -> git commit -> commit -> git push -> repository 

### Uploading changes:

#### Working directory 
files were created, changed but not added to the index
* git checkout fileName1.txt fileName2.txt 
* git checkout . (all files current directory and inside it )
* git clean -d -f (delete all files in working directory which were added after previous commit)

#### Staging area

git reset --fileName1.java
 
#### Commit
(files were committed but did not push yet)
if we can correct commit in two ways:
- if we forgot to add file in commit:
* git add forgottenFile.txt
* git commit amend "message" 
- if we want only change message we can use the same command
* git commit amend "message" 
Git change previous commit, it hash will be changed too.

if we want to roll back all committed changes:
* git reset HEAD~2  (2- amount of commits we need to roll back)

#### Reset
* git reset --mixed (by default) from commit to working directory
* git reset --soft from commit to index
* git reset hard (do not safe changes, delete everything  in current commit, rollback to previous)

#### Revert
(Changes were pushed to the repository)
* git revert SH1CodeLastCommit
* git push

revert is a new commit, it makes reversed changes. It needs push command.

### Merge
- fast-forward merge(just move HEAD main into HEAD feature,
no changes were added in main, all changes were made consequently)
- non fast-forward merge (created merge-commit between two branches)

### Git hooks.
Hooks reside in the .git/hooks directory of every Git repository. To “install” a hook, all you have to do is remove the .sample extension. Or, if you’re writing a new script from scratch, you can simply add a new file matching one of the above filenames, minus the .sample extension. Hooks need to be executable, 
so you may need to change the file permissions of the script if you’re creating it from scratch. For example, to make sure that prepare-commit-msg is executable, you would run the following command:
chmod +x prepare-commit-msg

#### Pre-Commit
The pre-commit script is executed every time you run git commit before Git
asks the developer for a commit message or generates a commit object.
You can use this hook to inspect the snapshot that is about to be committed.
For example, you may want to run some automated tests that make sure the
commit does not break any existing functionality or build to check if it is successful.


#### Pre-push
The pre-push hook runs during git push, after the remote refs have been updated
but before any objects have been transferred.
You can use it to validate a set of ref updates before 
xa push occurs (a non-zero exit code will abort the push).
 

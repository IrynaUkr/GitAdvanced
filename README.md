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
- fast-forward merge 
(just move HEAD main into HEAD feature, no changes were added in main, 
all changes were made consequently)
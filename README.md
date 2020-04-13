# ExampleMergeAdapter
A Demo of MergeAdapter

## Introduction

As described by **Florina Muntenescu**, [MergeAdapter](https://developer.android.com/reference/androidx/recyclerview/widget/MergeAdapter) is a new class available in ``recyclerview:1.2.0-alpha02`` which enables you to sequentially combine multiple adapters to be displayed in a single RecyclerView.

## Advantage

MergeAdapter helps to segregate the different adapter logic into it's own adapter and then combining it into one, instead of  having it all in one adapter and then distinguishing it.
In this project we have taken the use case of list having header and footer.

### RecyclerView and Adapter data

![RecyclerView and Adapter data](https://miro.medium.com/max/1400/0*dVXw_ylmIfbVvZkQ)


### Demo

![Demo of MergeAdapter](https://cdn-images-1.medium.com/max/1455/1*08PWUrY6Sf88YsRKIkBPVg.gif)


### Reference

[Merge adapters sequentially with MergeAdapter](https://medium.com/androiddevelopers/merge-adapters-sequentially-with-mergeadapter-294d2942127a)

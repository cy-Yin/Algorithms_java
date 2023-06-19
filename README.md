## Course Introduction

the **Algorithms** course by Robert Sedgewick and Kevin Wayne from Princeton University in [Coursera](https://www.coursera.org)

Including:
- [Algorithms I](https://www.coursera.org/learn/algorithms-part1)
- [Algorithms II](https://www.coursera.org/learn/algorithms-part2)

Using the **Java** language (completed through jdk-20.0.1, VScode in MacOS 10.15.7 Catalina)

```shell
~ % java --version
java 20.0.1 2023-04-18
Java(TM) SE Runtime Environment (build 20.0.1+9-29)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.1+9-29, mixed mode, sharing)
```

*This course covers the essential information that every serious programmer needs to know about algorithms and data structures, with emphasis on applications and scientific performance analysis of Java implementations. Part I covers elementary data structures, sorting, and searching algorithms. Part II focuses on graph- and string-processing algorithms.*

### Algorithms I

##### Week 01

- **Course Introduction**

Welcome to Algorithms, Part I.

- **Union−Find**

We illustrate our basic approach to developing and analyzing algorithms by considering the dynamic connectivity problem. We introduce the union−find data type and consider several implementations (quick find, quick union, weighted quick union, and weighted quick union with path compression). Finally, we apply the union−find data type to the percolation problem from physical chemistry.

- **Analysis of Algorithms**

The basis of our approach for analyzing the performance of algorithms is the scientific method. We begin by performing computational experiments to measure the running times of our programs. We use these measurements to develop hypotheses about performance. Next, we create mathematical models to explain their behavior. Finally, we consider analyzing the memory usage of our Java programs.

##### Week 02

- **Stacks and Queues**

We consider two fundamental data types for storing collections of objects: the stack and the queue. We implement each using either a singly-linked list or a resizing array. We introduce two advanced Java features—generics and iterators—that simplify client code. Finally, we consider various applications of stacks and queues ranging from parsing arithmetic expressions to simulating queueing systems.

- **Elementary Sorts**

We introduce the sorting problem and Java's Comparable interface. We study two elementary sorting methods (selection sort and insertion sort) and a variation of one of them (shellsort). We also consider two algorithms for uniformly shuffling an array. We conclude with an application of sorting to computing the convex hull via the Graham scan algorithm.

##### Week 03

- **Mergesort**

We study the mergesort algorithm and show that it guarantees to sort any array of n items with at most n lg n compares. We also consider a nonrecursive, bottom-up version. We prove that any compare-based sorting algorithm must make at least n lg n compares in the worst case. We discuss using different orderings for the objects that we are sorting and the related concept of stability.

- **Quicksort**

We introduce and implement the randomized quicksort algorithm and analyze its performance. We also consider randomized quickselect, a quicksort variant which finds the kth smallest item in linear time. Finally, we consider 3-way quicksort, a variant of quicksort that works especially well in the presence of duplicate keys.

##### Week 04

- **Priority Queues**

We introduce the priority queue data type and an efficient implementation using the binary heap data structure. This implementation also leads to an efficient sorting algorithm known as heapsort. We conclude with an applications of priority queues where we simulate the motion of n particles subject to the laws of elastic collision.

- **Elementary Symbol Tables**

We define an API for symbol tables (also known as associative arrays, maps, or dictionaries) and describe two elementary implementations using a sorted array (binary search) and an unordered list (sequential search). When the keys are Comparable, we define an extended API that includes the additional methods min, max floor, ceiling, rank, and select. To develop an efficient implementation of this API, we study the binary search tree data structure and analyze its performance.

##### Week 05

- **Balanced Search Trees**

In this lecture, our goal is to develop a symbol table with guaranteed logarithmic performance for search and insert (and many other operations). We begin with 2−3 trees, which are easy to analyze but hard to implement. Next, we consider red−black binary search trees, which we view as a novel way to implement 2−3 trees as binary search trees. Finally, we introduce B-trees, a generalization of 2−3 trees that are widely used to implement file systems.

- **Geometric Applications of BSTs**

We start with 1d and 2d range searching, where the goal is to find all points in a given 1d or 2d interval. To accomplish this, we consider kd-trees, a natural generalization of BSTs when the keys are points in the plane (or higher dimensions). We also consider intersection problems, where the goal is to find all intersections among a set of line segments or rectangles.

##### Week 06

- **Hash Tables**

We begin by describing the desirable properties of hash function and how to implement them in Java, including a fundamental tenet known as the uniform hashing assumption that underlies the potential success of a hashing application. Then, we consider two strategies for implementing hash tables—separate chaining and linear probing. Both strategies yield constant-time performance for search and insert under the uniform hashing assumption.

- **Symbol Table Applications**

We consider various applications of symbol tables including sets, dictionary clients, indexing clients, and sparse vectors.

### Algorithms II

##### Week 01

- **Introduction**

Welcome to Algorithms, Part II.

- **Undirected Graphs**

We define an undirected graph API and consider the adjacency-matrix and adjacency-lists representations. We introduce two classic algorithms for searching a graph—depth-first search and breadth-first search. We also consider the problem of computing connected components and conclude with related problems and applications.

- **Directed Graphs**

In this lecture we study directed graphs. We begin with depth-first search and breadth-first search in digraphs and describe applications ranging from garbage collection to web crawling. Next, we introduce a depth-first search based algorithm for computing the topological order of an acyclic digraph. Finally, we implement the Kosaraju−Sharir algorithm for computing the strong components of a digraph.

##### Week 02

- **Minimum Spanning Trees**

In this lecture we study the minimum spanning tree problem. We begin by considering a generic greedy algorithm for the problem. Next, we consider and implement two classic algorithm for the problem—Kruskal's algorithm and Prim's algorithm. We conclude with some applications and open problems.

- **Shortest Paths**

In this lecture we study shortest-paths problems. We begin by analyzing some basic properties of shortest paths and a generic algorithm for the problem. We introduce and analyze Dijkstra's algorithm for shortest-paths problems with nonnegative weights. Next, we consider an even faster algorithm for DAGs, which works even if the weights are negative. We conclude with the Bellman−Ford−Moore algorithm for edge-weighted digraphs with no negative cycles. We also consider applications ranging from content-aware fill to arbitrage.

##### Week 03

- **Maximum Flow and Minimum Cut**

In this lecture we introduce the maximum flow and minimum cut problems. We begin with the Ford−Fulkerson algorithm. To analyze its correctness, we establish the maxflow−mincut theorem. Next, we consider an efficient implementation of the Ford−Fulkerson algorithm, using the shortest augmenting path rule. Finally, we consider applications, including bipartite matching and baseball elimination.

- **Radix Sorts**

In this lecture we consider specialized sorting algorithms for strings and related objects. We begin with a subroutine to sort integers in a small range. We then consider two classic radix sorting algorithms—LSD and MSD radix sorts. Next, we consider an especially efficient variant, which is a hybrid of MSD radix sort and quicksort known as 3-way radix quicksort. We conclude with suffix sorting and related applications.

##### Week 04

- **Tries**

In this lecture we consider specialized algorithms for symbol tables with string keys. Our goal is a data structure that is as fast as hashing and even more flexible than binary search trees. We begin with multiway tries; next we consider ternary search tries. Finally, we consider character-based operations, including prefix match and longest prefix, and related applications.

- **Substring Search**

In this lecture we consider algorithms for searching for a substring in a piece of text. We begin with a brute-force algorithm, whose running time is quadratic in the worst case. Next, we consider the ingenious Knuth−Morris−Pratt algorithm whose running time is guaranteed to be linear in the worst case. Then, we introduce the Boyer−Moore algorithm, whose running time is sublinear on typical inputs. Finally, we consider the Rabin−Karp fingerprint algorithm, which uses hashing in a clever way to solve the substring search and related problems.

##### Week 05

- **Regular Expressions**

A regular expression is a method for specifying a set of strings. Our topic for this lecture is the famous grep algorithm that determines whether a given text contains any substring from the set. We examine an efficient implementation that makes use of our digraph reachability implementation from Week 1.

- **Data Compression**

We study and implement several classic data compression schemes, including run-length coding, Huffman compression, and LZW compression. We develop efficient implementations from first principles using a Java library for manipulating binary data that we developed for this purpose, based on priority queue and symbol table implementations from earlier lectures.

##### Week 06

- **Reductions**

Our lectures this week are centered on the idea of problem-solving models like maxflow and shortest path, where a new problem can be formulated as an instance of one of those problems, and then solved with a classic and efficient algorithm. To complete the course, we describe the classic unsolved problem from theoretical computer science that is centered on the concept of algorithm efficiency and guides us in the search for efficient solutions to difficult problems.

- **Linear Programming (optional)**

The quintessential problem-solving model is known as linear programming, and the simplex method for solving it is one of the most widely used algorithms. In this lecture, we given an overview of this central topic in operations research and describe its relationship to algorithms that we have considered.

- **Intractability**

Is there a universal problem-solving model to which all problems that we would like to solve reduce and for which we know an efficient algorithm? You may be surprised to learn that we do no know the answer to this question. In this lecture we introduce the complexity classes P, NP, and NP-complete, pose the famous P = NP question, and consider implications in the context of algorithms that we have treated in this course.
# Stella Recode: A Personal Project Of Climate Modeling

## What is this?
STELLA is a software used for climate modelling, consisting of several parts as listed below. The main advantage of this software is the creation of predictive models with known flow rates, turning physics, chemistry, etc. into computation. This project is an endeavor to build my own version of this software, which takes a trade-off that sacrifices visuals for processing speed. A model(called a scheme in this project) contains the following parts:

### Resevoirs:
A resevoir is a single value that is affected by all other parts of the program, and is the basis for all computation done by this program. Common examples of resevoirs could be the amount of water in the oceans, the cloud cover of a planet, the distance between orbiting bodies, etc.

This is kept in the program as a RESEVOIR object. It has the following properites:

1. The level("value") of the resevoir.
2. An array of all flows that positively contribute to the value.
3. An array of all flows that negatively contribute to the value.
4. A function that has the net flow to the resevoir to be used upon model execution.

### Flows:

### Constants:

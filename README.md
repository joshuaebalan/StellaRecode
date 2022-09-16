# Stella Recode: A Personal Project Of Climate Modeling

## What is this?
STELLA is a software used for climate modelling, consisting of several parts as listed below. The main advantage of this software is the creation of predictive models with known flow rates, turning physics, chemistry, etc. into computation. This project is an endeavor to build my own version of this software, which takes a trade-off that sacrifices visuals for processing speed. A model(called a scheme in this project) contains the following parts:

### Resevoirs:
A resevoir is a single value that is affected by all other parts of the program, and is the basis for all computation done by this program. Common examples of resevoirs could be the amount of water in the oceans, the cloud cover of a planet, the distance between orbiting bodies, etc.

This is kept in the program as a RESEVOIR object. It has the following properites:

1. The level("value") of the resevoir.
2. An array of all flows that positively contribute to the value.
3. An array of all flows that negatively contribute to the value.
4. A function that has the net flow to the resevoir to be used upon model execution. Think of this as a mathematical function to be applied every time step(simulated second).

### Flows:
Flows are "pipes" between resevoirs, by flowing between 2 resevoirs. Examples of this in climate modelling would be things like rain, sunlight energy, migration, etc. 

This is kept in a FLOW object. Its only property is the rate of flow, which is always positive - other steps in the problem determine which side drains and which side fills.

**Note: This operation can have as many operands as needed. For example, a flow can be determined by how "full" a resevoir is. A real-life example of this is the amount of water draining from a tub - the rate decreases when the tub nears empty.**


### Constants:
"Constants" is a bit of a misnomer - becuase equations have a lot of complex dependencies, "constants" are equations unto themselves that can be linked to flow rates and resevoirs to assist in computation. Some can be literal constants, such as the mass of an object, but others are variable, like the albedo(light reflectivity) of a planet, which can be variable based on cloud cover and composition. That albedo could potentially assist in energy retention calculations for a given planet under the effect of a star.

##Other Functions:
1. Output: spreadsheets, graphs, etc.(TBD)
2. Input(prompting)
3. Programmer's implementation - making into a library
4. Unit conversion support


full explanation at https://en.wikipedia.org/wiki/Ising_model#Monte_Carlo_methods_for_numerical_simulation

Grid of spins that follow the Ising model

spins that have their position in the table and in the space

table that has array of spins and handles finding neighbours

material has a table and can calculate all the properties of the material

temporal evolution of the spins : 

- a spin is selected at random
- the energy change of the spin flipping is computed
    - if the energy is lower : flip the spin
    - if the energy is higher : probability of still flipping the spin is computed (can be understood as thermal mixing)
repeated X (parameter) number of times

parameters of a given material:
- energy between spins (J)
- global mag field (B0)
- temperature (T)
- distance of the interactions, in this discrete case the number of considered neighbours (nN)
- time jump : number of considered spin

advanced parameters:
- number of dimension
- size of each dimension
- 
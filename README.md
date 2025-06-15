# Breakout with AI

This is a Java project built for university. It uses a basic feed-forward neural network trained by a genetic algorithm to play a simplified version of the classic game Breakout.

The AI reads the game state (ball, paddle, brick positions) and decides whether to move left or right. The training happens by evolving a population of networks over several generations, selecting those that perform best.

## Key Techniques

- Modular OOP design: core/ for game logic, elements/ for visual objects, ai/ for learning logic, and utils/ for shared constants and interfaces.

- Feed-forward neural network: custom implementation with one hidden layer, inputs are normalized game state values and outputs represent movement decisions.

- Genetic algorithm training: network weights evolve across generations using selection, mutation, and crossover to optimize performance.

 ## Libraries & Assets of Interest

- Java AWT/Swing – Uses standard Java GUI libraries; no exeternal dependencies required.

- Image resources – Stored in resources/images/; easily replaceable for visual tweaks or UI testing.

 ## Project Structure

<pre>src/
├── ai/           # Neural network and genetic algorithm
├── core/         # Game logic and board controller
├── elements/     # Ball, paddle, bricks
├── utils/        # Constants
resources/
└── images/       # Game images (ball, paddle, brick)
</pre>

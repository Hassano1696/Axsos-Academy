class Ninja {
    constructor(name,health) {
        this.name = name;
        this.health = health;
        this.speed = 3;
        this.strength = 3;
    }

    sayName() {
        console.log(this.name);
    }

    showStats() {
        console.log(`Name: ${this.name}`);
        console.log(`Strength: ${this.strength}`);
        console.log(`Speed: ${this.speed}`);
        console.log(`Health: ${this.health}`);
    }

    drinkSake() {
        this.health += 10;
    }
}

class Sensei extends Ninja {
    constructor(name,health=200) {
        super(name);
        this.wisdom = 10;
        this.health = health;
        this.speed = 10;
        this.strength = 10;
    }

    speakWisdom() {
        this.drinkSake();
    }
}

const sensei = new Sensei("Potato");
sensei.showStats();
sensei.speakWisdom();
sensei.showStats();

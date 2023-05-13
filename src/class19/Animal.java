package class19;

public abstract class Animal {

    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }


    void printInfo(double price) {

        System.out.println(name + "  " + color + "  " + breed + "  " + age + "  " + weight);
    }

    abstract void printInfo(String color);

    class horse extends Animal {
        double price;
        public horse(String name, String color, String breed, int age, double weight) {
            super(name, color, breed, age, weight );
            this.price=price;

        }

        @Override
        void printInfo(double price) {
            super.printInfo(this.price);
            System.out.println(price);
        }

        @Override
        void printInfo(String color) {

        }
    }
        class dog extends Animal {
        String color;
            public dog(String name, String color, String breed, int age, double weight) {
                super(name, color, breed, age, weight);
                this.color=color;

            }

            @Override
            void printInfo(String color) {

            }

            public void setColor(String color) {
                this.color = color;
                System.out.println(color);
            }
        }

            class cat extends Animal {
                public cat(String name, String color, String breed, int age, double weight) {
                    super(name, color, breed, age, weight);
                }

                @Override
                void printInfo(String color) {

                }
            }

    }

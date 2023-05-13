package class19;

    public class Animal2 {

        String name;
        String color;
        String breed;
        int age;
        double weight;

        void printInfo() {

            System.out.println(name + "  " + color + "  " + breed + "  " + age + "  " + weight);
        }

        class horse extends Animal {
            public horse(String name, String color, String breed, int age, double weight) {
                super(name, color, breed, age, weight);

            }

            @Override
            void printInfo(String color) {
                System.out.println(color);
            }
        }


        }
            class dog extends Animal {

                public dog(String name, String color, String breed, int age, double weight) {
                    super(name, color, breed, age, weight);
                }

                @Override
                void printInfo(String color) {
                    System.out.println(color);
                }

            }
                class cat extends Animal {
                    public cat(String name, String color, String breed, int age, double weight) {
                        super(name, color, breed, age, weight);
                    }

                    @Override
                    void printInfo(String color) {
                        System.out.println(color);
                    }

                }






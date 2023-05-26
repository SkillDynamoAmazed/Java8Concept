package org.example;



    class Parent {
        // private methods are not overridden
        private void m1()
        {
            System.out.println("From parent m1()");
        }

        protected void m2()
        {
            System.out.println("From parent m2()");
        }

        public void m3()
        {
            System.out.println("From parent m3()");
        }


    }

    class Child extends Parent {
        // new m1() method
        // unique to Child class
        public void m1()
        {
            System.out.println("From child m1()");
        }

        // overriding method
        // with more accessibility
        @Override
        public void m2()
        {
            System.out.println("From parent m3()");
        }

//        public void m3()
//        {
//            System.out.println("From child m3()");
//        }
    }

    // Driver class
    class mains {
        public static void main(String[] args)
        {
            Parent obj1 = new Parent();
            obj1.m2();
            Parent obj2 = new Child();
            obj2.m3();



        }
    }

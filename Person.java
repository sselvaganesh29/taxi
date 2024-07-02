public class Person
{
        private int id;

        private String name;

        private int destination;


        public Person( int id, String name )
        {
            this.id = id;
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public void setDestination(int destination)
        {
            this.destination = destination;
        }

        public int getDestination()
        {
            return destination;
        }


}

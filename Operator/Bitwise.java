class Bitwise
{
    public static void main(String[] args)
    {
        System.out.println("4&2: "+(4&2));//* 100&010 = 0, AND
        System.out.println("4|2: "+(4|2));//* 100|010 = 11 = 6, OR
        System.out.println("4^2: "+(4^2));//* 100|010 = 11 = 6, XOR, both diff then true

        System.out.println("\n4<<2: "+(4<<2));//* 4<<2 = (100<<2) = 10000 = 16, Left shift
        System.out.println("4>>2: "+(4>>2));//* 4<<2 = (100>>2) = 00001 = 1, Right shift
    }
}
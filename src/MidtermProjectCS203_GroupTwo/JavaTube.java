package MidtermProjectCS203_GroupTwo;

import java.util.Arrays;
import java.util.Comparator;

public class JavaTube {

    public static void main(String[] args) {

    // CookingVideo objects with appropriate recipe objects

        Recipe recipes = new Recipe("Banana Chocolate", "bread, egg, milk, cocoa powder, Water,banana, chocolate chip",
                "add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.", 3, 10, 2);
        CookingVideo cv = new CookingVideo("Chief's table", 45, 356, 245, 1000, recipes);
        Recipe recipe2 = new Recipe("Omelette", " egg, bell pepper, ham, spinach,salt, pepper",
                "add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.", 3, 10, 5);
        CookingVideo cv2 = new CookingVideo("TopChief", 56, 456, 356, 1200, recipe2);
        Recipe recipe3 = new Recipe("Dabo", "flour,water", "just mix them together ", 45, 30, 4);
        CookingVideo cv3 = new CookingVideo("Habesha Cook", 10, 67, 125, 450, recipe3);


        // GamingVideo objects.

        GamingVideo gv = new GamingVideo("packMan", "Fight", 50, 45, 40, 100);
        GamingVideo gv2 = new GamingVideo("grand auto teft", "robbbery", 56, 90, 45, 109);
        GamingVideo gv3 = new GamingVideo("call of duty", "shooting", 50, 45, 35, 150);


        // Create an array of Video objects

        Video[] allvideos = {cv, cv2, cv3, gv, gv2, gv3};


        // Create an array of CookingVideo objects

        CookingVideo[] cookingVideos = {cv, cv2, cv3};
        

        // Create an array of GamingVideo objects

        GamingVideo[] gamingVideos = {gv, gv2, gv3};

        // print the videos using printVideos method

           // videoPrinter(allvideos);

        // Sort the allVideos array naturally

        Arrays.sort(allvideos);

        // Print the allVideos array and compare the outputs.

          //videoPrinter(allvideos);

        //Sort the allVideos array by title using the appropriate member inner class

        JavaTube jb= new JavaTube();
        JavaTube.sortVideoByTitle videoByTitle = jb.new sortVideoByTitle();

        Arrays.sort( allvideos,videoByTitle);

        // Print the allVideos array and compare the outputs.

       //videoPrinter(allvideos);



        // Sort the allVideos array by views using the appropriate static inner class

        JavaTube jb2 = new JavaTube();
        JavaTube.sortVideoByView videoByView = jb2.new sortVideoByView();
        Arrays.sort(allvideos, videoByView);
        Arrays.sort(allvideos, videoByView);



//      Print the allVideos array time and compare the outputs.

        //videoPrinter(allvideos);



        //Print the cookingVideosList using the printAllCookingVideos

             //printAllCookingVideos(cookingVideos);

        // Sort the cookingVideos array by ingredientList using local inner class

        class Local implements Comparator<CookingVideo> {
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getIngridentsList().length - o2.getIngridentsList().length;
            }
        }
           Local local= new Local();
            Arrays.sort(cookingVideos,local);

           // Print the cookingVideos array and compare the outputs.
             // JavaTube.sortCookingVideosByIngridientsList(cookingVideos);


        //sortCookingVideoByServingSizeDescending method in order to
        //sort array of CookingVideos by serving size in a descending order
        //(high to low) using an anonymous inner class

        Comparator<CookingVideo>sortCookingVideoByServingSizeDescending = new Comparator<CookingVideo>(){
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return (o1.getCookingRecipe().getServings()-o2.getCookingRecipe().getServings())*-1;
            }
        };
        // anonymous class cooking  videos sorted by serving size descending

         Arrays.sort(cookingVideos,sortCookingVideoByServingSizeDescending);



        // Print the cookingVideos array

            // printAllCookingVideos(cookingVideos);

        // prints all cooking videos recipes

             //printAllCookingRecipes(cookingVideos);


        // Optional

        //Sort the gaming videos array using the game name property with a
        //lambda expression then print out the array using the printAllGamingVideos
        //method you’ve created previously

        //Arrays.sort(gamingVideos,((o1, o2) -> o1.getGameName().compareTo(o2.getGameName())));
        //printGamingVideos(gamingVideos);


        //Create a list of Video objects using your custom VideoList class,

        VideoList videoList = new VideoList();

        // adding cooking and gaming videos into the videoList
        videoList.add(cv);
        videoList.add(cv2);
        videoList.add(cv3);
        videoList.add(gv);
        videoList.add(gv2);
        videoList.add(gv3);

        VideoList videoList1 = new VideoList(allvideos,6);

        // Print out your list by calling its toString() method.

          System.out.println(videoList);


    }

    // ************************** END OF MAIN METHOD ************************************

    // Implementation of sortVideosByTitle inner class for sorting video object by their title.

    class sortVideoByTitle implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }

    }


    // Implementation of sortVideosByViews inner class for sorting video objects by the amount of views

    class sortVideoByView implements Comparator<Video>{

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getViews()- o2.getViews();
        }
    }


    // Implementation of sortCookingVideoByIngredientList method
    // for sorting array of CookingVideo objects by the number of ingredients using a local inner class.

    static void sortCookingVideosByIngridientsList(CookingVideo[] cookingVideos) {
        for(CookingVideo cookingVideo: cookingVideos)
            System.out.println(cookingVideo);

    }


    // Implementation of printAllCookingRecipies method to loop
    //through an array of CookingVideos and print out their recipes using a foreach loop.

    static void printAllCookingRecipes(CookingVideo[] cookingVideos){
        for (CookingVideo cookingVideo: cookingVideos)
            System.out.println(cookingVideo.printRecipe());
    }


   // Implementation of the VideoPrinter method in order to be able to loop through an array
    //of Video objects and print out their information using their toString()

    static void videoPrinter(Video[]videos){
        for(int i=0; i<videos.length;i++){
            System.out.println(videos[i].toString());
        }

    }

    // Implementation of all printALLCookingVideos

    static void printAllCookingVideos(CookingVideo[] cookingVideos){
        for (CookingVideo cookingVideo: cookingVideos)
            System.out.println(cookingVideo);
    }

    static void printGamingVideos(GamingVideo[] gamingVideos){
        for (GamingVideo gamingVideo : gamingVideos)
            System.out.println(gamingVideo);
    }
}


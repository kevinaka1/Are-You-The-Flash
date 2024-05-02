Write your name and email
    Name: Kevin Aka
    Email: kevin.aka@tufts.edu

Describe how to compile and run your program
    To compile:
        Type "javac Canvas.java"
        Type "javac The_Flash_Button.java"
        Type "javac Window.java"
    To run:
        Type "java Window"

Describe the rules of your simulation or game
    
    Once you run the program, a button witht he text "I give up. I'm not the Flash" appears.
    The inteded way to access the button is to click the bottom of the screen with your 
    mouse. A light gray lightning bolt with a small black dot appears. Keep 
    clicking the dot until the lightning bolt turns light yellow. Once it's
    light yellow, a button will appear with the text "Welcome, Flash. Click to
    see your suit". This the button that you access through a nonstandard approach.
    Then, you click the button and an image of a Flash suit appears. In additon,
    another button with the text "Time to save the day" appears. Click that button,
    the program prints "Good luck". Then, the program ends.

    However, there are other ways to end the program. if you click the give up button,
    the prgrogram prints "Haha. You'll never be The Flash.", and then ends. Another way 
    to end the program is if you keep clicking the dot on the lightning bolt, but it takes
    too long to reach yellow, so you can just press the give up button. The last way to end
    the program is if you eventually reach yellow, but before you click the suit button, you
    click soemwhere else. The program prints "Missed it. You'll never get access again.",
    and then it ends.


Describe all objects in your program alongside an inheritance and aggregation hierarchy.
    Inheritance
        No subclass
            Window() object - starts the program

            flash_window() object - creates the window for the program, which
            will hold/display the canvas

            lightning_color() object - stores the color of the lightning bolt

            flash_button_clicked() object - stores where you clicked the button
            with the text "Welcome, Flash. Click to see your suit"

            clicked_bottom() object - stores where your mouse clicked the bottom of the screen

            flash_suit_image() object - stores the orginal image of your flash suit

            flash_suit_image_scaled() object - stores a scaled down image of your flash suit

            rand() object - generates a random number between the bounds given (0-9)

            rand_int1() object - stores the random number that was generated

            TFListener object() - creates the listener of the the_flash() object. Tracks whether you
            clicked on the button or not.

            SDListener object() - creates the listener of the save_day_button() object. Tracks whether you
            clicked on the button or not.

            GUListener object() - creates the listener of the give_up_button() object. Tracks whether you
            clicked on the button or not.

        JPanel subclass
            flash_canvas() object - creates the canvas the holds all the images, buttons, and drawings
        
        JButton subclass
            the_flash() object - creates the button with the text: 
            "Welcome, Flash. Click to see your suit" 

            give_up_button() object - creates the button with the text:
            "I give up. I'm not The Flash"

            save_day_button() object - creates the button with the text:
            "Time ti save the day"
        
 
Aggregation
        Window() object contains
            flash_window() object
            flash_canvas() object contains
                the_flash() object
                give_up_button() object
                save_day_button() object
                lightning_color() object
                flash_button_clicked() object
                clicked_bottom() object
                flash_suit_image() object
                flash_suit_image_scaled() object
                rand() object
                rand_int1() object
                TFListener object()
                SDListener object()
                GUListener object()


Questions and Concerns with NonWimp2
    In order to get the image, I need to download it to my laptop, then enter
    the filepath of the image as a string into the program. When you see this,
    you will have the image on your computer, so that code may not work, or may
    produce an error.

    
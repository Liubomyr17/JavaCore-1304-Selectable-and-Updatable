package com.company;

/*

1304 Selectable and Updatable
Create a Screen class and implement the Selectable and Updatable interfaces in it.
Remember to implement the methods!
Requirements:
1. The Screen class should implement (implements) the Selectable interface.
2. The Screen class must implement the (implements) Updatable interface.
3. In the Screen class, the onSelect method of the Selectable interface must be implemented.
4. In the Screen class, the refresh method of the Updatable interface must be implemented.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}


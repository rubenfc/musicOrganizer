import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if (validIndex(index))
        {
            String filename = files.get(index);
            System.out.println(filename);
        }
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    /**
     * comprueba que el indice es valido
     */
    public void checkIndex(int index)
    {
        if((index < 0) || ( index >= files.size()))
        {
            System.out.println("error, ramgo no valido");
        }
    }
    
   /**
    * devuelve un valor booleano en funci�n de si su par�metro entero es un �ndice v�lido o no 
    */
   public boolean validIndex(int index)
   {
       boolean valido = true;
       if((index < 0) || ( index >= files.size()))
       {
           valido = false;          
       }
       return valido;
   }
}

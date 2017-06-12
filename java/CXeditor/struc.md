STORAGE

class basecard
  java.net.URL url
  hash urlHash
  String tag
  Author author
  Date published
  Array[String] paragraphs
  


class Author
  String quals
  String firstName
  String lastName
  String middleName

class Format
      String notes
      Array[][int] ulPositions starting from basecard 0th position
      Array[][int] emphPositions
      Array[][int] hlPositions

EDITOR

  Read
        From a json file convert to java objects
        Java objects stored 

  Render
        Java objects ran through,

        Render
                Basecard
                        Tag
                        Author.lastName bold
                                        (Handle and/et al here)
                        Author.firstName small
                        date bold
                        Quals small
                        url
                        Space/newline
                Format
                        a "*NOTES" in smalltext, then the notes string from format
                        Newline
                        Selected paragraphs
                        Selected ul,emph,hl

CUTTER

EXTENSION   

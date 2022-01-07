**Tables Names and Relationships**


Course -> OneToOne relationship with CourseMaterial, ManyToOne with Teacher and ManyToMany with Student Table. </br>
CourseMaterial -> OneToOne Relationship with Course(Bidirectional ie. Course to CourseMaterial and CourseMaterial to Course). </br>
Gaurdian-> Guardian is Embeddable class and embedded into Student Class. </br>
Student-> ManyToMany Relationship with Course</br>
Teacher-> OneToMany with Course.







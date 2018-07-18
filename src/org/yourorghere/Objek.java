package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void K(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3 , 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(0,0,1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 1, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, -4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.2
        gl.glColor3d(1,0,0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, -4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, -4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 1, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, 3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 1, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 0, 3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 1,3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, 3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 0, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3,  1, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, -3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3,0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3,  1,-3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
    }
    static void O(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3 , 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(0,0,1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 1, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, -4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.2
        gl.glColor3d(1,0,0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, -4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-4.3, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-4.3, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 1, -4.3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 0, -4.3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 1, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, 3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 1, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 0, 3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 1,3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.1
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, 3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.2
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(0, 1, 0);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 0, 3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3,  1, 3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(1,0,0);
        gl.glVertex3d(0, 0, 0);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3, 0, -3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3,0, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4.3
        gl.glColor3d(1,0,0);
        gl.glVertex3d(3, 0, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(3,  1,-3);
        gl.glColor3d(1,0,0);
        gl.glVertex3d(-3, 1, -3);
        gl.glColor3d(0,0,1);
        gl.glVertex3d(-3, 0, -3);
        gl.glEnd();
    }
    
}

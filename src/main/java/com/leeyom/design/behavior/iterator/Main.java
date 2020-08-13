package com.leeyom.design.behavior.iterator;

public class Main {

    public static void main(String[] args) {

        IProject project = new Project();
        project.add("星球大战项目1", 3000, 100000);
        project.add("星球大战项目2", 4000, 200000);
        project.add("星球大战项目3", 5000, 300000);
        project.add("星球大战项目4", 6000, 400000);

        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }

}

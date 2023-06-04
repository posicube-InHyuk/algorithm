package com.designPattern.Factory;

// 인터페이스
interface Shape {
    void draw();
}

// 구체적인 구현 클래스 - 직사각형
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

// 구체적인 구현 클래스 - 정사각형
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

// 팩토리 클래스
class ShapeFactory {
    // 객체를 생성하는 정적 팩토리 메서드
    public static Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}


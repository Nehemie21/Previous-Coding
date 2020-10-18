float sectionArea(float radius)
{
    float result =0;
    const float PI = 3.14159;

    result = PI* pow(radius , 2);

    return result;
}
float surfaceArea(float radius , float height)
{
    float result =0;
    const float PI = 3.14159;

    result = (2 * PI * pow(radius , 2)) + (height * 2 * PI *radius);

    return result;

}
float volume(float radius , float height)
{
    float result =0;
    const float PI = 3.14159;

    result = PI * height * pow(radius , 2);

    return result;
}
